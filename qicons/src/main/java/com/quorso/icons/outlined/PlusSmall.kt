package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.PlusSmall: ImageVector
    get() {
        if (_PlusSmall != null) {
            return _PlusSmall!!
        }
        _PlusSmall = ImageVector.Builder(
            name = "Outlined.PlusSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                verticalLineToRelative(12f)
                moveToRelative(6f, -6f)
                horizontalLineTo(6f)
            }
        }.build()

        return _PlusSmall!!
    }

@Suppress("ObjectPropertyName")
private var _PlusSmall: ImageVector? = null
