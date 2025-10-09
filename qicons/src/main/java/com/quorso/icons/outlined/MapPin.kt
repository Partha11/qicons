package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.MapPin: ImageVector
    get() {
        if (_MapPin != null) {
            return _MapPin!!
        }
        _MapPin = ImageVector.Builder(
            name = "Outlined.MapPin",
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
                moveTo(15f, 10.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 10.5f)
                curveToRelative(0f, 7.142f, -7.5f, 11.25f, -7.5f, 11.25f)
                reflectiveCurveTo(4.5f, 17.642f, 4.5f, 10.5f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, 0f)
                close()
            }
        }.build()

        return _MapPin!!
    }

@Suppress("ObjectPropertyName")
private var _MapPin: ImageVector? = null
