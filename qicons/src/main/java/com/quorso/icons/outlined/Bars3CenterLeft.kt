package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Bars3CenterLeft: ImageVector
    get() {
        if (_Bars3CenterLeft != null) {
            return _Bars3CenterLeft!!
        }
        _Bars3CenterLeft = ImageVector.Builder(
            name = "Outlined.Bars3CenterLeft",
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
                horizontalLineTo(12f)
                moveToRelative(-8.25f, 5.25f)
                horizontalLineToRelative(16.5f)
            }
        }.build()

        return _Bars3CenterLeft!!
    }

@Suppress("ObjectPropertyName")
private var _Bars3CenterLeft: ImageVector? = null
