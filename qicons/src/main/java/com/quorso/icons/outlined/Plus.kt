package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Plus: ImageVector
    get() {
        if (_Plus != null) {
            return _Plus!!
        }
        _Plus = ImageVector.Builder(
            name = "Outlined.Plus",
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
                moveTo(12f, 4.5f)
                verticalLineToRelative(15f)
                moveToRelative(7.5f, -7.5f)
                horizontalLineToRelative(-15f)
            }
        }.build()

        return _Plus!!
    }

@Suppress("ObjectPropertyName")
private var _Plus: ImageVector? = null
