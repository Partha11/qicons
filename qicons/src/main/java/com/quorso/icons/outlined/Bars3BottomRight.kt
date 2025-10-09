package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Bars3BottomRight: ImageVector
    get() {
        if (_Bars3BottomRight != null) {
            return _Bars3BottomRight!!
        }
        _Bars3BottomRight = ImageVector.Builder(
            name = "Outlined.Bars3BottomRight",
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
                moveTo(12f, 17.25f)
                horizontalLineToRelative(8.25f)
            }
        }.build()

        return _Bars3BottomRight!!
    }

@Suppress("ObjectPropertyName")
private var _Bars3BottomRight: ImageVector? = null
