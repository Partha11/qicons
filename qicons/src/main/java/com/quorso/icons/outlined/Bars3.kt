package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Bars3: ImageVector
    get() {
        if (_Bars3 != null) {
            return _Bars3!!
        }
        _Bars3 = ImageVector.Builder(
            name = "Outlined.Bars3",
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
                moveTo(3.75f, 6.75f)
                horizontalLineToRelative(16.5f)
                moveTo(3.75f, 12f)
                horizontalLineToRelative(16.5f)
                moveToRelative(-16.5f, 5.25f)
                horizontalLineToRelative(16.5f)
            }
        }.build()

        return _Bars3!!
    }

@Suppress("ObjectPropertyName")
private var _Bars3: ImageVector? = null
